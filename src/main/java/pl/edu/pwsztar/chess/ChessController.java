package pl.edu.pwsztar.chess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.pwsztar.chess.domain.ChessFacade;
import pl.edu.pwsztar.chess.dto.FigureMoveDto;

@Controller
@RequestMapping(value="/api")
class ChessController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChessController.class);

    private final ChessFacade chessFacade;

    ChessController(ChessFacade chessFacade) {
        this.chessFacade = chessFacade;
    }


    @CrossOrigin
    @PostMapping(value = "/chess/is-correct-move")
    ResponseEntity<Boolean> isCorrectMove(@RequestBody FigureMoveDto figureMoveDto) {
        LOGGER.info("*** move details : {}", figureMoveDto);
        return ResponseEntity.ok(chessFacade.isCorrectMove(figureMoveDto));
    }
}
