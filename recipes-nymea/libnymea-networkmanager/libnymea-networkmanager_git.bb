DESCRIPTION = "libnymea-networkmanager package"

LICENSE = "LGPL-3.0 | NYMEA-COMMERCIAL"
LIC_FILES_CHKSUM="file://LICENSE.LGPL3;md5=3000208d539ec061b899bce1d9ce9404 \
                  file://libnymea-networkmanager/networkmanager.h;endline=26;md5=c334ac0bc498bb8b53007125752e1471"

SRC_URI="git://github.com/nymea/libnymea-networkmanager.git;protocol=https;branch=master"
# Release: 0.5.1
SRCREV="eff82a3a7e859c2b90c1688945d797d6e205a2ca"
PV = "git${SRCPV}"

DEPENDS += "qtbase qtconnectivity"

S = "${WORKDIR}/git"

inherit qmake5

