public class ToStringTest {

    String type;
    String state;
    String errormessage;

    public ToStringTest(String type, String state, String errormessage) {
        this.type = type;
        this.state = state;
        this.errormessage = errormessage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    @Override
    public String toString() {
        return "ToStringTest{" +
                "type='" + type + '\'' +
                ", state='" + state + '\'' +
                ", errormessage='" + errormessage + '\'' +
                '}';
    }


    public static void main(String[] args){
        System.out.println(new ToStringTest("1","2","你猜"));
    }
}
