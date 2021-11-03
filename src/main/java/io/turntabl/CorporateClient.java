package io.turntabl;

public class CorporateClient extends Client {

    public String getAccountManager() {
        return accountManager;
    }

    private final String accountManager;
    public CorporateClient(String name, String id, Level level,  String accountManager) {

        super(name, id, level);
        this.accountManager = accountManager;
    }


    @Override
    public String clientContactName() {
        return accountManager;
    }
}
