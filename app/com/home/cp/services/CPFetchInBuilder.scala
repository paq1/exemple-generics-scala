package com.home.cp.services

import com.home.common.services.remotes.BaseFetchInBuilder
import com.home.cp.cmd.CPCommand

final class CPFetchInBuilder () extends BaseFetchInBuilder[CPCommand, CPFetchIn] {
  override def build(cmd: CPCommand): CPFetchIn = CPFetchIn(infoUtileJustePourFetchLol = "pouet")
}
