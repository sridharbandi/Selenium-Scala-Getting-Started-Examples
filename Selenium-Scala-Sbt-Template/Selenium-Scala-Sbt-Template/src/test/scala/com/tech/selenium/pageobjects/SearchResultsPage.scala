package com.tech.selenium.pageobjects

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.{FindBy, PageFactory}

class SearchResultsPage(driver: WebDriver) {

  @FindBy(partialLinkText = "Selenium - Web Browser Automation")
  var lnkSelenium: WebElement = _

  PageFactory.initElements(driver, this)

  def isLnkSeleniumPresent(): Boolean = {
    lnkSelenium.isDisplayed
  }
}