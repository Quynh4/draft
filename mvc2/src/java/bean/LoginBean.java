package bean;

/**
 *
 * @author viquy
 */
public class LoginBean {

    private String name, passWord;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean validae() {
        if (passWord.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }
}
