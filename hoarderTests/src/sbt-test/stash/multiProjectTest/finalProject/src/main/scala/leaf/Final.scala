/*
 * Hoarder - Cached compilation plugin for sbt.
 * Copyright 2016 - 2017, Krzysztof Romanowski
 * This software is released under the terms written in LICENSE.
 */

package finall

import base.Base
import leaf.Leaf
import akka.actor.Actor

class Final extends Base {
  val leaf: Leaf = ???
}

class FinalActor extends Actor {
  override def receive = {
    case _ => println("Ala")
  }
}