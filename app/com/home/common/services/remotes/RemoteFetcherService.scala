package com.home.common.services.remotes

trait RemoteFetcherService[IN <: BaseFetchIn, T <: BaseRemoteData] {

  def fetch(in: IN): T

}
