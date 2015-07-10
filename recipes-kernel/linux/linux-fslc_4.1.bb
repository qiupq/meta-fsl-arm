# Copyright (C) 2012-2015 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "FSL Community BSP Linux mainline based kernel with backported features and fixes"
DESCRIPTION = "Linux kernel based on mainline kernel used by FSL Community BSP in order to \
provide support for some backported features and fixes, or because it was applied in linux-next \
and takes some time to become part of a stable version, or because it is not applicable for \
upstreaming."

include linux-fslc.inc

PV = "4.1+git${SRCPV}"

SRCBRANCH = "patches-4.1"
SRCREV = "665a389b8e62c444969ac65e3e0eda5d8c13ea24"

COMPATIBLE_MACHINE = "(mxs|mx5|mx6)"
