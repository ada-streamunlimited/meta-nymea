DESCRIPTION = "nymea-remoteproxy package"

LICENSE = "(GPL-3.0 & LGPL-3.0) | NYMEA-COMMERCIAL"
LIC_FILES_CHKSUM="file://LICENSE.LGPL3;md5=3000208d539ec061b899bce1d9ce9404 \
                  file://LICENSE.GPL3;md5=500948a8f0c6fefa21e8694792e6b728 \
                  file://server/main.cpp;endline=26;md5=6ad94e4fdc53ed04d6af1e48393a1d49 \
                  file://libnymea-remoteproxyclient/proxyconnection.h;endline=26;md5=8145dc10125aa2f5603e524b7245a070"

SRC_URI="git://github.com/nymea/nymea-remoteproxy.git;protocol=https;branch=master"
# Release: 0.1.14
SRCREV="f5b5bb030dfd7cebcc1432be7d2411ac0f3ad7a8"
PV = "git${SRCPV}"

DEPENDS += "qtbase qtwebsockets ncurses"

S = "${WORKDIR}/git"

inherit qmake5

EXTRA_QMAKEVARS_PRE += "CONFIG+=disabletests"

