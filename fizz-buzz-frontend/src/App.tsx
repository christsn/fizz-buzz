import { QueryClient, QueryClientProvider, useQuery } from 'react-query'
import './App.css'
 
const basePath = process.env.REACT_APP_API_URL

const queryClient = new QueryClient()
 
function App() {
   return (
     <QueryClientProvider client={queryClient}>
       <FizzBuzzValues />
     </QueryClientProvider>
   )
 }
 
 function FizzBuzzValues() {
   const { isLoading, data } = useQuery('fizzBuzzData', () =>
     fetch(`${basePath}/fizz-buzz`).then(res =>
       res.json()
     )
   )
 
   if (isLoading) return <>'Loading...'</>
 
   return (
     <div className='container'>
      {data.map((fizzBuzzValue: any, index: number) => (
        <div key={index} className='card'>
          {fizzBuzzValue}
        </div>
        ))
      }
    </div>
   )
 }

export default App;
