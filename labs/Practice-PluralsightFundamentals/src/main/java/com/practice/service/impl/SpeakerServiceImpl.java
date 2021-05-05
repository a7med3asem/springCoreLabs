package com.practice.service.impl;

import com.practice.model.Speaker;
import com.practice.repository.SpeakerRepository;
import com.practice.repository.impl.HibernateSpeakerRepositoryImpl;
import com.practice.service.SpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    /*
     * Spring solved this hard coded creation by the following
     *  private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
     * */


    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        System.out.println("SpeakerServiceImpl (SpeakerRepository speakerRepository)");
        this.repository = speakerRepository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("We are called after the constructors");
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

//    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
