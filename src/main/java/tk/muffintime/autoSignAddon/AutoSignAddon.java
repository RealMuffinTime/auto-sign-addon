package tk.muffintime.autoSignAddon;

import net.fabricmc.loader.api.FabricLoader;
import tk.muffintime.autoSignAddon.modules.AutoSign;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class AutoSignAddon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final boolean ASTEROID_LOADED = FabricLoader.getInstance().isModLoaded("asteroid");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Auto Sign AutoSignAddon");

        // Modules
        Modules.get().add(new AutoSign());
    }

    @Override
    public String getPackage() {
        return "tk.muffintime.autoSignAddon";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("RealMuffinTime", "auto-sign-addon");
    }
}
