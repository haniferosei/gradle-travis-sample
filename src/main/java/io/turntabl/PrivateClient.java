package io.turntabl;

public class PrivateClient extends Client{
    public PrivateClient(String name, String id, Level level) {
        super(name, id, level);
    }

    @Override
    public String clientContactName() {
        return getName();
    }


}
