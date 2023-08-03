package project1.InMemoryModel;

import project1.ModelElements.Camera;
import project1.ModelElements.Flash;
import project1.ModelElements.PoligonalModel;
import project1.ModelElements.Scene;

public class ModelStore implements IModelChanger, IModelChangedObserver {
    public PoligonalModel Models;
    public Scene Scenes;
    public Flash Flashes;
    public Camera Cameras;
    private IModelChangedObserver changeObserves;

    public Scene GetScene(int n) {

    }

    @java.lang.Override
    public void NotifyChange(IModelChanger sender) {

    }
}
