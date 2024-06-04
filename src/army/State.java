package army;


public interface State {
    public void attack(Army army);
    public void defend(Army army);
    public void retreat(Army army);
}
