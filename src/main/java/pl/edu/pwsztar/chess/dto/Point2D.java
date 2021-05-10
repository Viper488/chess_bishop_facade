package pl.edu.pwsztar.chess.dto;

import lombok.*;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Point2D {
    private int x;
    private int y;
}
