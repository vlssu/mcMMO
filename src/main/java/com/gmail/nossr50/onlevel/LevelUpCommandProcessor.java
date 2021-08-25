package com.gmail.nossr50.onlevel;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.datatypes.skills.PrimarySkillType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * This class will handle execution of {@link LevelUpCommand}'s
 * This class is invoked by our {@link com.gmail.nossr50.listeners.SelfListener}
 */
public class LevelUpCommandProcessor {
    @NotNull private HashMap<TargetSkill, LevelUpCommand> commandMap;

    public LevelUpCommandProcessor() {
        commandMap = new HashMap<>();
        loadPayloads();
    }

    /**
     * Load the {@link LevelUpCommand} payloads to be executed as needed
     */
    private void loadPayloads() {
        //Load the payloads from the config file
    }

    /**
     * Execute any relevant {@link LevelUpCommand}'s for this player
     * @param mmoPlayer target player
     * @param primarySkillType target skill type
     */
    public void onLevel(@NotNull McMMOPlayer mmoPlayer, @NotNull PrimarySkillType primarySkillType) {

    }
}
