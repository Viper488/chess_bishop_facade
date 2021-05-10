package pl.edu.pwsztar.chess.domain;

import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;
import pl.edu.pwsztar.chess.dto.Point2D;
import pl.edu.pwsztar.chess.enums.FigureType;

@Transactional
public class ChessFacade {
    private final ChessCreator chessCreator;

    public ChessFacade(ChessCreator chessCreator) {
        this.chessCreator = chessCreator;
    }

    public boolean isCorrectMove(FigureMoveDto figureMoveDto){
        Point2D source = chessCreator.fromChessCoordinates(figureMoveDto.getSource());
        Point2D destination = chessCreator.fromChessCoordinates(figureMoveDto.getDestination());

        return figureMoveDto.getType() == FigureType.BISHOP && Math.abs(destination.getX() - source.getX()) == Math.abs(destination.getY() - source.getY());
    }

}
