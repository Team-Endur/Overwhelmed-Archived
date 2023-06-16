package overwhelmed.overwhelmed.util.datafix.schemas;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.fixes.References;
import net.minecraft.util.datafix.schemas.NamespacedSchema;

import java.util.Map;
import java.util.function.Supplier;

public class V3 extends NamespacedSchema {
    public V3(int versionKey, Schema parent) {
        super(versionKey, parent);
    }

    protected static TypeTemplate equipment(Schema schema) {
        return DSL.optionalFields("ArmorItems", DSL.list(References.ITEM_STACK.in(schema)), "HandItems", DSL.list(References.ITEM_STACK.in(schema)));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        Map<String, Supplier<TypeTemplate>> map = super.registerEntities(schema);
        return map;
    }
}
