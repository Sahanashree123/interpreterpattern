package interpreterpattern;
public class ClsContext {
    private String strExpression;

    public ClsContext(String strExpression) {
        this.strExpression = strExpression;
    }

    public String getStrExpression() {
        return strExpression;
    }

    public void setStrExpression(String strExpression) {
        this.strExpression = strExpression;
    }
}