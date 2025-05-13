package konrad.lubaski.client;

public enum Piece {

    KING("king"), QUEEN("queen"), BISHOP("bishop"), KNIGHT("knight"), ROOK("rook"), PAWN("pawn");

    private String name;

    Piece(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
