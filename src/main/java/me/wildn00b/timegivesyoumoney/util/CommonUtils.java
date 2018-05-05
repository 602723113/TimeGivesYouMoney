package me.wildn00b.timegivesyoumoney.util;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Common Util
 *
 * @author Zoyn
 */
public final class CommonUtils {

    private CommonUtils(){}

    public static List<Player> getOnlinePlayers() {
        List<Player> players = new ArrayList<>();
        Bukkit.getWorlds().forEach(world -> players.addAll(world.getPlayers()));
        return players;
    }

}
