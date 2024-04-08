package cloud.deuterium.maxbet.character.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Milan Stojkovic 04-Apr-2024
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GiftItemDto {
    @NotBlank
    private String characterItemId;
    @NotBlank
    private String characterId;
}
