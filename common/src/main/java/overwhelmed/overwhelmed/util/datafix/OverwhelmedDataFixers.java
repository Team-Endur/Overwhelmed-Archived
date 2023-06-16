package overwhelmed.overwhelmed.util.datafix;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.SharedConstants;
import net.minecraft.util.datafix.fixes.AddNewChoices;
import net.minecraft.util.datafix.fixes.ItemRenameFix;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.util.datafix.schemas.NamespacedSchema;
import overwhelmed.overwhelmed.util.datafix.schemas.V0;
import overwhelmed.overwhelmed.util.datafix.schemas.V1;
import overwhelmed.overwhelmed.util.datafix.schemas.V3;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

// DO NOT TOUCH THIS IF YOU HAVE NO IDEA WHAT IT DOES
// reference: https://fabricmc.net/wiki/tutorial:datafixer
public class OverwhelmedDataFixers {
    private static final DataFixer dataFixer;
    private static final BiFunction<Integer, Schema, Schema> SAME_NAMESPACED = NamespacedSchema::new;
    public static final int DATA_VERSION = 3;
    public static Schema schemaV0; // 0.1
    public static Schema schemaV1; // 0.1.1
    public static Schema schemaV2; // 0.1.2
    public static Schema schemaV3; // 0.2.0(-SNAPSHOT)

    private static synchronized DataFixer createFixerUpper(Set<DSL.TypeReference> set) {
        DataFixerBuilder dataFixerBuilder = new DataFixerBuilder(DATA_VERSION);
        addFixers(dataFixerBuilder);
        if (set.isEmpty()) {
            return dataFixerBuilder.buildUnoptimized();
        } else {
            Executor executor = Executors.newSingleThreadExecutor((new ThreadFactoryBuilder()).setNameFormat("Datafixer Bootstrap").setDaemon(true).setPriority(1).build());
            return dataFixerBuilder.buildOptimized(set, executor);
        }
    }

    private static void addFixers(DataFixerBuilder dataFixerBuilder) {
        schemaV0 = dataFixerBuilder.addSchema(0, V0::new);
        schemaV1 = dataFixerBuilder.addSchema(1, V1::new);
        dataFixerBuilder.addFixer(new AddNewChoices(schemaV1, "Added Blowgun Projectile", References.ENTITY));
        schemaV2 = dataFixerBuilder.addSchema(2, SAME_NAMESPACED);
        schemaV3 = dataFixerBuilder.addSchema(3, V3::new);
        dataFixerBuilder.addFixer(ItemRenameFix.create(schemaV3, "Rename Snails to Garden Snail",
                createRenamer("overwhelmed:snail", "overwhelmed:garden_snail")));
    }

    private static UnaryOperator<String> createRenamer(Map<String, String> map) {
        return (string) -> map.getOrDefault(string, string);
    }

    private static UnaryOperator<String> createRenamer(String string, String string2) {
        return (string3) -> Objects.equals(string3, string) ? string2 : string3;
    }

    static {
        dataFixer = createFixerUpper(SharedConstants.DATA_FIX_TYPES_TO_OPTIMIZE);
    }
}
