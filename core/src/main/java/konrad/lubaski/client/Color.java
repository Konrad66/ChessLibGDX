package konrad.lubaski.client;

public enum Color {

    WHITE("w_"), BLACK("b_");

    private String filePath;

    Color(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
