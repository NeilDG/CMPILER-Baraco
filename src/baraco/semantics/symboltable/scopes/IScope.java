package baraco.semantics.symboltable.scopes;

import baraco.representations.BaracoValue;

public interface IScope {
    public abstract BaracoValue searchVariableIncludingLocal(String identifier);
    public abstract boolean isParent();
}
