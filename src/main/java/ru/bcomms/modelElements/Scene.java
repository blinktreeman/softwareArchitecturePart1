package ru.bcomms.modelElements;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Scene {
    private final UUID id;
    private final Set<PolygonalModel> models;
    private final Set<Flash> flashes;

    public Scene() {
        this.id = UUID.randomUUID();
        this.models = new HashSet<>();
        this.flashes = new HashSet<>();
    }

    public boolean addModel(PolygonalModel model) {
        return models.add(model);
    }

    public boolean removeModel(PolygonalModel model) {
        return models.remove(model);
    }

    public boolean addFlash(Flash flash) {
        return flashes.add(flash);
    }

    public boolean removeFlash(Flash flash) {
        return flashes.remove(flash);
    }

    public UUID getId() {
        return id;
    }

    public Set<PolygonalModel> getModels() {
        return models;
    }

    public Set<Flash> getFlashes() {
        return flashes;
    }
}
