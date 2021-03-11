package pl.sklep.sklepspringdataboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import pl.sklep.sklepspringdataboot.Kraj.*;

@Component
public class Run {


    private KrajRepo krajRepo;

    @Autowired
    public Run(KrajRepo krajRepo) {
        this.krajRepo = krajRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void run(){
        Kraj kraj = new Kraj(320);
        krajRepo.delete(kraj);

    }
}
