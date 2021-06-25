package com.example.ApplicationDemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Command;
import pojo.CommandRequest;
import service.DemoService;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@RestController
public class DemoController {
    DemoService demoService = new DemoService();

    final int keyIndex = 0;
    final int commandIndex = 1;

    @PostMapping("/**")
    public ResponseEntity<Command> getCommands(CommandRequest request){
        Command commandResponse = new Command();
        if(request == null || request.getText() == null || request.getText().trim().length() == 0){
            commandResponse.setStatus(HttpStatus.BAD_REQUEST);
            commandResponse.setResponseCommand(null);
            return new ResponseEntity(commandResponse, commandResponse.getStatus() );
        }

        if(request.getCommand().equals("/lookup")){
            commandResponse = demoService.getDefinationforCommand(request.getText(), request.getChannel_id());
            return new ResponseEntity(commandResponse, commandResponse.getStatus() );
        }

        if(request.getCommand().equals("/define")){
            String requestString = request.getText();
            String[] keyCommandText = requestString.split(" ");
            String keyRequest = keyCommandText[keyIndex];
            String commandDefination = keyCommandText[commandIndex];

            boolean requestResponse = demoService.addDefinationforKey(keyRequest, commandDefination, request.getChannel_id());
            if(requestResponse){
                commandResponse = demoService.getDefinationforCommand(keyRequest, request.getChannel_id());
            }
            return new ResponseEntity(commandResponse, commandResponse.getStatus() );
        }

        return new ResponseEntity(null, HttpStatus.BAD_REQUEST);
    }
}
