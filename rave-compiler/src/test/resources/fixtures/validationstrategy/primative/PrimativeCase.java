package fixtures.validationstrategy.primative;

import fixtures.validationstrategy.StrictModeFactory;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.uber.rave.annotation.Validated;

@Validated(factory = StrictModeFactory.class)
public class PrimativeCase {
    int primativeField;
    int objectField;

    public PrimativeCase(int field) {
        this.primativeField = primativeField;
        this.objectField = primativeField;
    }

    public int getPrimativeField() {
        return primativeField;
    }

    public Object getObjectField() {
        return objectField;
    }
}
