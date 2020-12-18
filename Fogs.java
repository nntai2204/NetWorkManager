package user;

import java.util.List;

public class Fogs {
    private List<User> acceptUser;
    private DiLiList diLiList;
    private BlockList blockList;

    public List<User> getAcceptUser() {
        return acceptUser;
    }

    public void setAcceptUser(List<User> acceptUser) {
        this.acceptUser = acceptUser;
    }

    public DiLiList getDiLiList() {
        return diLiList;
    }

    public void setDiLiList(DiLiList diLiList) {
        this.diLiList = diLiList;
    }

    public BlockList getBlockList() {
        return blockList;
    }

    public void setBlockList(BlockList blockList) {
        this.blockList = blockList;
    }
}
