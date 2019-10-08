import org.scalatest.{Matchers, WordSpec}

/**
  * Created by Nadim Bahadoor on 15/10/2018.
  *
  * The content was inspired by the original tutorial below, and feedback from readers at http://allaboutscala.com.
  *
  * Tutorial: ScalaTest
  *
  * [[http://allaboutscala.com/scala-cheatsheet/#scalatest-introduction Tutorial]]
  *
  * Copyright 2016 - 2019 Nadim Bahadoor (http://allaboutscala.com)
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy of
  * the License at
  *
  *  [http://www.apache.org/licenses/LICENSE-2.0]
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations under
  * the License.
  */
class DonutStoreWordSpecStyle extends WordSpec with Matchers {

  "A DonutStore" can {
    "have a dummy boolean test" in {
      "DonutStore" === "DonutStore"
    }

    "should have a Seq of 2 donut items" in {
      Seq("plain donut", "vanilla donut").length shouldEqual 2
    }
  }
}
