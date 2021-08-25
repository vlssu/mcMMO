package com.gmail.nossr50.onlevel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface LevelUpCommandTriggers {
    /**
     * The {@link TargetSkill}'s that can trigger a {@link LevelUpCommand}
     *
     * @return the relevant target skills
     */
    @NotNull List<TargetSkill> getTargetSkills();

    /**
     * The levels at which this command will trigger
     *
     * @return the levels at which this command will trigger
     */
    @NotNull List<Integer> getTargetLevels();
}
