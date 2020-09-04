package cn.sysu.solution.pojo;

public class equations {
    private Integer id;

    private String equation;

    private String quantityid;

    private String answer;

    private String realequation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation == null ? null : equation.trim();
    }

    public String getQuantityid() {
        return quantityid;
    }

    public void setQuantityid(String quantityid) {
        this.quantityid = quantityid == null ? null : quantityid.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getRealequation() {
        return realequation;
    }

    public void setRealequation(String realequation) {
        this.realequation = realequation == null ? null : realequation.trim();
    }
}