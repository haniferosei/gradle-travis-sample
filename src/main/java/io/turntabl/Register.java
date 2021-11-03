package io.turntabl;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clients;

    public  Register(List<Client> clients){
        this.clients=clients;

    }

    public List<String> goldClients(){
        return clients.stream()
                .filter(s ->s.getLevel() ==Level.GOLD)
                .map(Client::clientContactName)
                .collect(Collectors.toList());
    }

     public Optional <String> getClientNameById(String id){
        return clients.stream()
                .filter(s->s.getId().equals(id))
                .map(Client::getName)
                .findFirst();

     }

     public Map<Level,Long> clientCount(){
        return clients.stream()
                      .collect(Collectors.groupingBy(Client::getLevel,Collectors.counting()));
     }
}
