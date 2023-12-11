const puppeteer = require("puppeteer");

(async () => {
  const browser = await puppeteer.launch({ headless: false });
  const page = await browser.newPage()
  await page.goto("https://www.goal.com/en-us/fixtures/2023-12-09")

  const grabLeagues = await page.evaluate(() => {
    const allLeagues = document.querySelectorAll('.football-football-competition_competition__wbjsu');
    console.log(allLeagues);


    // let leagueArr = []
    // allLeagues.forEach((quoteTag) => {
    //   const quoteInfo = quoteTag.querySelectorAll('span');
    //   const actualQuotes = quoteInfo[0];
    //   const actualAuthor = quoteInfo[1];

    //   const authorName = actualAuthor.querySelector("small")

    //   quotesArr.push({quote: actualQuotes.innerText, author: authorName.innerText});
    });
    // return quotesArr;
    console.log(grabLeagues);
    await browser.close();
}) ();