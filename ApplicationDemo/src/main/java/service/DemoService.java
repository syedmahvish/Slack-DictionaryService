package service;

import org.springframework.http.HttpStatus;
import pojo.Command;
import pojo.TeamDefination;

import java.util.*;

public class DemoService {

    Map<String, TeamDefination> storeCommands;

    public DemoService(){
        storeCommands = new HashMap<>();
        storeDefaultCommands();
    }

    private void storeDefaultCommands(){
        TeamDefination team1 = new TeamDefination();
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("C0258C1PKP1", "Potus value");
        team1.setTeamMap(tempMap);
        storeCommands.put("potus", team1);

        team1 = new TeamDefination();
        tempMap = new HashMap<>();
        tempMap.put("C0258C1PKP1", "Domain value");
        team1.setTeamMap(tempMap);
        storeCommands.put("domain", team1);

        team1 = new TeamDefination();
        tempMap = new HashMap<>();
        tempMap.put("C0258C1PKP1", "donaim name server value value");
        team1.setTeamMap(tempMap);
        storeCommands.put("dns", team1);
    }

    public Command getDefinationforCommand(String command, String channelId){
        Command commmandResponse = new Command();
        command = command.toLowerCase();
        if(storeCommands.containsKey(command)){
            TeamDefination team1 = storeCommands.get(command);
            Map<String, String> tempMap = team1.getTeamMap();
            if(tempMap.containsKey(channelId)) {
                commmandResponse.setResponseCommand(tempMap.get(channelId));
                commmandResponse.setStatus(HttpStatus.OK);
                return commmandResponse;
            }
        }

        commmandResponse.setResponseCommand(null);
        commmandResponse.setStatus(HttpStatus.BAD_REQUEST);
        return commmandResponse;
    }

    public boolean addDefinationforKey(String text, String defination, String channelId){
        text = text.toLowerCase();
        if(storeCommands.containsKey(text)) {
            TeamDefination team1 = storeCommands.get(text);
            Map<String, String> tempMap = team1.getTeamMap();
            tempMap.put(channelId, defination);
            team1.setTeamMap(tempMap);
            storeCommands.put(text, team1);
            System.out.println("------after Adding existing defination------");
            printMap();
            return true;
        }
            TeamDefination team1 = new TeamDefination();
            Map<String, String> tempMap = new HashMap<>();
            tempMap.put(channelId, defination);
            team1.setTeamMap(tempMap);
            storeCommands.put(text, team1);
        System.out.println("------after New defination------");
            printMap();
            return true;
    }

    private void printMap(){
        for(Map.Entry entry : storeCommands.entrySet()){
            System.out.println( entry.getKey() + " : " + entry.getValue().toString());

        }
    }


}
