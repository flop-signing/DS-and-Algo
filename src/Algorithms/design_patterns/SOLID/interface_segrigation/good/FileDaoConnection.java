package Algorithms.design_patterns.SOLID.interface_segrigation.good;

//Here dont need to bother about db part.
public class FileDaoConnection implements FileInterface,DAOInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}