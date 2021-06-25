package pojo;

public class CommandRequest {
    String api_app_id;
    String channel_id;
    String channel_name;
    String command;
    boolean is_enterprise_install;
    String response_url;	//https://hooks.slack.com/commands/T025BUJGH1T/2186784109910/IyR9tPp3eg0Bt7tAWQsNczlW
    String team_domain;	//emojilaunchpad
    String team_id;	//T025BUJGH1T
    String text;//	here
    String token; //	4HyFLotzDVWkNCgbobJHA8st
    String trigger_id; //	2199734883172.2181970561061.1c018fcd8963e7b700582ffc9ba2b39f
    String user_id;	//U0264LLKRUG

    public String getApi_app_id() {
        return api_app_id;
    }

    public void setApi_app_id(String api_app_id) {
        this.api_app_id = api_app_id;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getChannel_name() {
        return channel_name;
    }

    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public boolean isIs_enterprise_install() {
        return is_enterprise_install;
    }

    public void setIs_enterprise_install(boolean is_enterprise_install) {
        this.is_enterprise_install = is_enterprise_install;
    }

    public String getResponse_url() {
        return response_url;
    }

    public void setResponse_url(String response_url) {
        this.response_url = response_url;
    }

    public String getTeam_domain() {
        return team_domain;
    }

    public void setTeam_domain(String team_domain) {
        this.team_domain = team_domain;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTrigger_id() {
        return trigger_id;
    }

    public void setTrigger_id(String trigger_id) {
        this.trigger_id = trigger_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    String user_name;	//ericf
}
