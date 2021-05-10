package pl.edu.pwsztar.chess.domain;

import pl.edu.pwsztar.chess.dto.Point2D;

class ChessCreator {
    Point2D fromChessCoordinates(String coordinates){
        return Point2D.builder().x(coordinates.charAt(2)).y(coordinates.charAt(0)-96).build();
    }
}
// Example coordinates: a_1
// x = 1
// y = a - 96 = 1
// return Point2D(x,y)
