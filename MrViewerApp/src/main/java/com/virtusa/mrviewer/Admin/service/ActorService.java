package com.virtusa.mrviewer.Admin.service;

import java.util.Optional;
import java.util.List;
import com.virtusa.mrviewer.Admin.model.Actor;

public interface ActorService {
    void addActor(Actor actor);

    List<Actor> getall();

    Optional<Actor> getById(long id);

    void deleteById(long id);

    int updateById(Actor actorObj, long id);

}
