import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class GameConfig {
    private static GameConfig uniqueInstance;
    private String appId;
    private String userName;
    private String language;
    private String offline;
    private String autoDLC;
    private String buildId;
    private String dlcName;
    private String updateDB;
    private String signature;
    private String windowInfo;
    private String lvWindowInfo;
    private String applicationPath;
    private String workingDirectory;
    private String waitForExit;
    private String noOperation;

    private GameConfig() {
        String path = "src/GameConfig.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                List<String> config = Arrays.asList(linha.split("="));
                if (config.size() != 2) {
                    System.out.println(config.get(0) + "=");
                    continue;
                }
                System.out.println(config.get(0) + "=" + config.get(1));
                switch (config.get(0)) {
                    case "AppId":
                        appId = config.get(1);
                        break;
                    case "UserName":
                        userName = config.get(1);
                        break;
                    case "Language":
                        language = config.get(1);
                        break;
                    case "Offline":
                        offline = config.get(1);
                        break;
                    case "AutoDLC":
                        autoDLC = config.get(1);
                        break;
                    case "BuildId":
                        buildId = config.get(1);
                        break;
                    case "DLCName":
                        dlcName = config.get(1);
                        break;
                    case "UpdateDB":
                        updateDB = config.get(1);
                        break;
                    case "Signature":
                        signature = config.get(1);
                        break;
                    case "WindowInfo":
                        windowInfo = config.get(1);
                        break;
                    case "LVWindowInfo":
                        lvWindowInfo = config.get(1);
                        break;
                    case "ApplicationPath":
                        applicationPath = config.get(1);
                        break;
                    case "WorkingDirectory":
                        workingDirectory = config.get(1);
                        break;
                    case "WaitForExit":
                        waitForExit = config.get(1);
                        break;
                    case "NoOperation":
                        noOperation = config.get(1);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAppId() {
        return appId;
    }

    public String getUserName() {
        return userName;
    }

    public String getLanguage() {
        return language;
    }

    public String getOffline() {
        return offline;
    }

    public String getAutoDLC() {
        return autoDLC;
    }

    public String getBuildId() {
        return buildId;
    }

    public String getDlcName() {
        return dlcName;
    }

    public String getUpdateDB() {
        return updateDB;
    }

    public String getSignature() {
        return signature;
    }

    public String getWindowInfo() {
        return windowInfo;
    }

    public String getLvWindowInfo() {
        return lvWindowInfo;
    }

    public String getApplicationPath() {
        return applicationPath;
    }

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public String getWaitForExit() {
        return waitForExit;
    }

    public String getNoOperation() {
        return noOperation;
    }

    public static GameConfig getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new GameConfig();
        }
        return uniqueInstance;
    }
}