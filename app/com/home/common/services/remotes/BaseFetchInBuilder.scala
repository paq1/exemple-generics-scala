package com.home.common.services.remotes

import com.home.common.cmd.GenererDocumentCommand

trait BaseFetchInBuilder[CMD <: GenererDocumentCommand, FI <: BaseFetchIn] {
  def build(cmd: CMD): FI
}
