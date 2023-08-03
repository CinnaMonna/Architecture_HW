package project1.inMemoryModel;

import project1.modelElements.Camera;
import project1.modelElements.Flash;
import project1.modelElements.PoligonalModel;
import project1.modelElements.Scene;

public class ModelStore implements IModelChanger, IModelChangedObserver {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangedObserver changeObserves;

    public Scene getScene(int n) {

    };

    @java.lang.Override
    public void notifyChange(IModelChanger sender) {

    }
}
