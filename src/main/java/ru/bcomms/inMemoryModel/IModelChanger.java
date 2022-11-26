package ru.bcomms.inMemoryModel;

public interface IModelChanger {
    void notifyChange(IModelChanger sender);
    void registerModelChanger(IModelChangedObserver observer);
    void removeModelChanger(IModelChangedObserver observer);
}
