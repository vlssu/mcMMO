package com.gmail.nossr50.onlevel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LevelUpCommand {

    /**
     * Raw command input, this is before any processing is done (regex etc)
     *
     * @return the raw command input from the config file
     */
    @NotNull String getRawInput();

    /**
     * The command after regex operations etc
     *
     * @return the processed command
     */
    @NotNull String getProcessedInput();

    /**
     * Who should execute this level up command
     *
     * @return who should execute this level up command
     */
    @NotNull SkillDispatcher getSender();


    /**
     * Get the {@link LevelUpCommandTriggers}'s for this command
     *
     *  @return the {@link LevelUpCommandTriggers} for this command
     */
    @NotNull LevelUpCommandTriggers getCommandTriggers();

    /**
     * The permission node for this command
     *
     * @return the permission node for this command, null if not needed
     */
    @Nullable String getPermissionNode();
}
