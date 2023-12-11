const puppeteer = require("puppeteer");


(async () => {
  const browser = await puppeteer.launch({ headless: false });
  const page = await browser.newPage()
  await page.goto("https://quotes.toscrape.com/login")

  await page.click('a[href="/login"]');

  await page.type("#username", "PedroTech");
  await page.type("#password", "PedroTech");

  await page.click('input[value="Login"]');

  await browser.close();
})();
