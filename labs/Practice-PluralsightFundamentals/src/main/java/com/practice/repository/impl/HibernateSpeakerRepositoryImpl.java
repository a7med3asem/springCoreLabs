package com.practice.repository.impl;

import com.practice.model.Speaker;
import com.practice.repository.SpeakerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Ahmed");
        speaker.setLastName("Asim");

        speakers.add(speaker);

        return speakers;
    }

}
