package cloud.deuterium.maxbet.character.services;

import cloud.deuterium.maxbet.character.entities.CharacterItem;
import cloud.deuterium.maxbet.character.listener.WinnerListener;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by Milan Stojkovic 07-Apr-2024
 */
public class WinnerListenerTest {

    Set<CharacterItem> items = Set.of(
            new CharacterItem("1", null, null),
            new CharacterItem("2", null, null),
            new CharacterItem("3", null, null));

    @RepeatedTest(10)
    @DisplayName("Should return random Item")
    void get_random_item() {

        Optional<CharacterItem> optional = WinnerListener.getRandomItem(items);

        assertThat(optional.isPresent()).isTrue();
    }

    @RepeatedTest(10)
    @DisplayName("Should return random Item")
    void get_random_item_2() {

        Optional<CharacterItem> optional = WinnerListener.getRandomItem(List.of(new CharacterItem("1", null, null)));

        assertThat(optional.isPresent()).isTrue();
    }

    @Test
    void get_random_item_3() {

        Optional<CharacterItem> optional = WinnerListener.getRandomItem(List.of());

        assertThat(optional.isEmpty()).isTrue();
    }
}
