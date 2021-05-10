package pl.edu.pwsztar.chess.dto;

import lombok.*;
import pl.edu.pwsztar.chess.enums.FigureType;

import java.io.Serializable;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class FigureMoveDto implements Serializable {
    private String source;
    private String destination;
    private FigureType type;
}
