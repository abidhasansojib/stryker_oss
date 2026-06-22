package com.zalexdev.stryker.ota;

public final class StrykerEndpoints {

    public static final String GITHUB_REPO = "https://github.com/zalexdev/strykerapp";

    public static final String MANIFEST_URL =
            "https://raw.githubusercontent.com/zalexdev/strykerapp/main/stryker_manifest.json";

    // NetHunter rootfs URLs - Debian-based minimal images
    public static final String FALLBACK_CHROOT_64 =
            "https://kali.download/nethunter-images/current/rootfs/kali-nethunter-rootfs-minimal-arm64.tar.xz";

    public static final String FALLBACK_CHROOT_32 =
            "https://kali.download/nethunter-images/current/rootfs/kali-nethunter-rootfs-minimal-armhf.tar.xz";

    public static final String PREFS = "stryker_ota";

    private StrykerEndpoints() {
    }
}
