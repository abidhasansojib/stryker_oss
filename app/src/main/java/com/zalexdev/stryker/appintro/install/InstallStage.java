package com.zalexdev.stryker.appintro.install;

public enum InstallStage {
    PREPARING("Preparing storage layout"),
    DOWNLOADING("Downloading NetHunter chroot"),
    UNPACKING("Unpacking NetHunter chroot"),
    MOUNTING("Mounting NetHunter chroot"),
    UPGRADING("Updating Debian packages"),
    DEPLOYING_EXPLOITS("Copying built-in exploits"),
    FINALIZING("Writing version marker"),
    DONE("Installation complete");

    public final String title;

    InstallStage(String title) {
        this.title = title;
    }
}
