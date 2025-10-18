package Algorithms.design_patterns.SOLID.interface_segrigation.good;


//This is good we will only include the dao operation
// And segregate connection part so consumer can implement required interfaces.
public interface DAOInterface {
    public void createRecord();
    public void deleteRecord();
}